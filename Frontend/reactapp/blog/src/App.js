import logo from './logo.svg';
import './App.css';
import React,{ useState }from 'react';

function App() {



  let [글제목, 글제목변경] = useState('남자 코트 추천'); 
  let [글제목2, 글제목변경2] = useState('남자 코트 추천2'); 
  let [글제목3, 글제목변경3] = useState(['남자 코트 추천3', '강남 우동 맛집']); 
  let posts = '강남고기맛집';
  function 함수(){
    return 100
  }
  return (
    <div className="App">
      <div className="black-nav">
          <div style ={{color : 'blue', fontSize:'30px'}}>개발 Blog</div>
      </div>
      
      <h4>{posts}</h4>

      <div className="list">
        <h3>{글제목}</h3>
        <p>5월 11일 발행</p>
        <hr/>
      </div>

      <div className="list">
        <h3>{글제목2}</h3>
        <p>5월 11일 발행</p>
        <hr/>
      </div>

      <div className="list">
        <h3>{글제목3[1]}</h3>
        <p>5월 11일 발행</p>
        <hr/>
      </div>
   

    </div>
  );
}

export default App;
