import React from 'react'
import AllProducts from './components/AllProducts'

import {Route, Routes, useNavigate } from 'react-router-dom'
import ProductDetail from './components/ProductDetail'
const App = () => {
  const navigate = useNavigate();
  return (
    <Routes>
      <Route path = "/" element = {<AllProducts/>}/>
      <Route path = "/product/:id" element = {<ProductDetail/>}/>
    </Routes>
  )
}

export default App