import React from 'react'
import AllProducts from './components/AllProducts'
import Home from './pages/Home'
import {Route, Routes, useNavigate } from 'react-router-dom'
import ProductDetail from './components/ProductDetail'
import Payment from './components/Payment'
import AddProduct from './components/AddProduct'
const App = () => {
  const navigate = useNavigate();
  return (
    <Routes>
      <Route path = "/" element = {<Home/>}/>
      <Route path = "/product/:id" element = {<ProductDetail/>}/>
      <Route path = "/paymentgateway/:id" element = {<Payment/>}/>
      <Route path = "/product/addnew" element = {<AddProduct/>}/>
    </Routes>
  )
}

export default App