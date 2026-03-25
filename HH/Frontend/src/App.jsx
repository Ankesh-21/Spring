import React, { useEffect, useState } from 'react'
import axios from 'axios';
import Products from './Components/Products';
import Navbar from './Components/Navbar'
import { Routes,Route } from 'react-router-dom';
import AddProduct from './Pages/AddProduct';
import Hero from './Pages/Hero';
const App = () => {
  return (
    <Routes>
      <Route path='/' element = {<Hero/>}/>
      <Route path='/addproduct' element = {<AddProduct/>}/>
    </Routes>
   
  )
}

export default App
