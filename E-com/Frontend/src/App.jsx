import React from 'react'
import AllProducts from './components/AllProducts'
import Home from './pages/Home'
import {Route, Routes, useNavigate } from 'react-router-dom'
import ProductDetail from './components/ProductDetail'
import Payment from './components/Payment'
const App = () => {
  const navigate = useNavigate();
  return (
    <Routes>
      <Route path = "/" element = {<Home/>}/>
      <Route path = "/product/:id" element = {<ProductDetail/>}/>
      <Route path = "/paymentgateway/:id" element = {<Payment/>}/>
    </Routes>
  )
}

export default App