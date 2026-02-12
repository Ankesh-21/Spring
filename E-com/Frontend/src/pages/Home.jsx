import React from 'react'
import Navbar from '../components/Navbar'
import AllProducts from '../components/AllProducts'
import { useState,useEffect } from 'react'
import axios from 'axios'
const Home = () => {
  const [products, setProducts] = useState([]);

  const fetchProducts = async () => {
    try {
      const res = await axios.get("http://localhost:8080/api/products");
      setProducts(res.data);
    } catch (err) {
      console.error(err);
    }
  };

  useEffect(() => {
    fetchProducts();
  }, []);

  const handleDelete = async (id) => {
    if (!window.confirm("Delete this product?")) return;
    try {
      await axios.delete(`http://localhost:8080/api/product/${id}`);
      fetchProducts();
    } catch (err) {
      console.error(err);
    }
  };

  return (
    <>
      <Navbar />
      <AllProducts products={products} onDelete={handleDelete} />
    </>
  )
}

export default Home