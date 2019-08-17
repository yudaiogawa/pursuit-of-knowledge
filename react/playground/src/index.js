import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

function FirstComponent() {
  return (
    <div>
      <h1>Welcome React Playground :)</h1>
      <img src="https://source.unsplash.com/random/400x200" />
    </div>
  )
}

ReactDOM.render(
  <FirstComponent />,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
