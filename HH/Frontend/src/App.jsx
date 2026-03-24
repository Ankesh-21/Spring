import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Products from './Pages/Products';
import Navbar from './Components/Navbar'
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
    <>
      <Navbar/>
     <Products/>
    </>
   
  )
}

export default App
