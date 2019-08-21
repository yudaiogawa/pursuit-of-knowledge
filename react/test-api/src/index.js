import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';

const url = "http://localhost:8888/posts";

class Form extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      title: "",
      text: ""
    }

    this.changeTitle = this.changeTitle.bind(this);
    this.changeText = this.changeText.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  changeTitle(event) {
    this.setState({ title: event.target.value });
  }

  changeText(event) {
    this.setState({ text: event.target.value });
  }

  handleSubmit(event) {
    event.preventDefault();
    this.props.addContent(this.state.title, this.state.text);
  }

  render() {
    return (
      <form onSubmit={this.handleSubmit} className="form">
        <div>
          <label>
            <input type="text" placeholder="Title" value={this.state.title} onChange={this.changeTitle} />
          </label>
        </div>
        <div>
          <label>
            <input type="text" placeholder="Text" value={this.state.text} onChange={this.changeText} />
          </label>
        </div>
        <div>
          <input type="submit" value="Add" />
        </div>
      </form>
    );
  }
}

class Posts extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      posts: this.props.posts
    };

    this.addContent = this.addContent.bind(this);
  }

  addContent(title, text) {
    fetch(url, {
      method: 'post',
      headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
      body: 'title=' + title + "&text=" + text
    }).then(function(res) {
      return res.json();
    }).then(function(json) {
      this.state.posts.push({
        id: json.id,
        title: json.title,
        text: json.text
      });

      this.setState(this.state);
    }.bind(this));
  }

  render() {
    return (
      <section>
        {this.state.posts.map(function(post, index) {
          return (
            <div key={post.id} className="content">
              <h1>{post.title}</h1>
              <p>{post.text}</p>
            </div>
          )
        }.bind(this))}
        <Form addContent={this.addContent} />
      </section>
    );
  }
}

fetch(url).then(function(res) {
  return res.json();
}).then(function(json) {
  ReactDOM.render(
    <Posts posts={json} />,
    document.getElementById('root')
  );
});

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
