import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';

const url = "http://localhost:8888/posts";

class Posts extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      posts: this.props.posts
    };
  }

  render() {
    return (
      <section>
        {this.state.posts.map(function(post, index) {
          return (
            <div key={post.id}>
              <h1>{post.title}</h1>
              <p>{post.text}</p>
            </div>
          )
        }.bind(this))}
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
