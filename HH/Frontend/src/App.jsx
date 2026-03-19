import React, { useEffect, useState } from 'react'
import axios from 'axios';
const App = () => {
  const [products,setProducts] = useState([]);
  useEffect(()=>{
    axios.get('https://localhost:8080')
    .then(res=>{
      setProducts(res.data);
    })
    .catch(err=>{
      console.log(err);
    });
  });
  return (
    <div>
      
    </div>
  )
}

export default App
