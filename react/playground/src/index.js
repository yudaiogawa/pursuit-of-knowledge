import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

let siteMetaData = {
  title: 'React Playground',
  subTitle: 'Welcome React playground :)'
};

const unescapeHtml = {
  __html: '<p>Unescape p tag in JSX.</p>'
};

// Stateless-Component or Functional-Component
function StatelessComponent() {
  return (
    <div>
      <h1>{ siteMetaData.title }</h1>
      <h2>{ siteMetaData.subTitle }</h2>
      <span dangerouslySetInnerHTML={ unescapeHtml } />
      <img src="https://source.unsplash.com/random/400x200" />
    </div>
  )
}

// Class-Component
class ClassComponent extends React.Component {
  render() {
    return (
      <div className="classComponent">
        <h1>Rendering Class Component</h1>
      </div>
    )
  }
}

ReactDOM.render(
  <ClassComponent />,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
