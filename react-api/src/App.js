import React, {Component} from 'react';
import Articles from './components/articles';
import axios from 'axios';

class App extends Component {
  
  state = {
    articles: []
  }

  componentDidMount() {

    //fetch('http://localhost:8082/articles')
    const proxyurl = "https://cors-anywhere.herokuapp.com/";
    const url = "http://localhost:8082/articles";
    fetch(url,{
      method:"GET",
      // mode: 'no-cors',
      headers:{
          "Content-Type": "application/json",
      }
  })
    .then(res => res.json())
    .then((data) => {
      this.setState({ articles: data })
      console.log(data)
    })
    .catch(console.log)

  // var config = {
  //   headers: {'Access-Control-Allow-Origin': '*'}
  // };
  // // axios.defaults.headers.post['Access-Control-Allow-Origin'] = '*';
  // axios.get(`http://localhost:8082/articles`, config ,{
  //   proxy: {
	//   host: '192.168.0.10',
	//   port: 8082
	// }
  // })
  //     .then(res => {
  //       this.setState({ articles: res.data });
  //     });
  }

  render () {
    return (
      <Articles articles = {this.state.articles} />
    )
  }
}

export default App;