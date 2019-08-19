import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import PropTypes from 'prop-types';

let siteMetaData = {
  title: 'React Playground',
  subTitle: 'Welcome React playground :)'
};

const unescapeHtml = {
  __html: '<p>Unescape p tag in JSX.</p>'
};

// Class-Component
class HelloWorld extends React.Component {

  render() {
    return (
      <div>
        <h1>{ siteMetaData.title }</h1>
        <h2>{ siteMetaData.subTitle }</h2>
        <span dangerouslySetInnerHTML={ unescapeHtml } />
        <Message />
        <img src="https://source.unsplash.com/random/400x200" />
      </div>
    )
  }

}

class Message extends React.Component {

  constructor() {
    super();
    this.state = {
      message: 'The initial message :)'
    };
    this.updateMsg = this.updateMsg.bind(this)
  }

  updateMsg(event) {
    console.log("[DEBUG] Called 'updateMsg' method.")
    this.setState({
      message: event.target.value
    });
  }

  render() {
    return (
      <div className="divMsg">
        <p>{this.state.message}</p>
        <input type="text" onChange={this.updateMsg} />
      </div>
    )
  }

}

// Type checking with propTypes.
Message.propTypes = {
  message: PropTypes.string.isRequired
}

// Default data of props.
Message.defaultProps = {
  message: '[WARNING] Not message has been passed.'
}

ReactDOM.render(
  <HelloWorld />,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
