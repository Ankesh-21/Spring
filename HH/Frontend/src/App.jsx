import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Products from './Pages/Products';
const App = () => {
  // const [products,setProducts] = useState([]);
  // useEffect(()=>{
  //   axios.get('https://localhost:8080')
  //   .then(res=>{
  //     setProducts(res.data);
  //   })
  //   .catch(err=>{
  //     console.log(err);
  //   });
  // });
  return (
    <Products/>
  )
}

export default App
