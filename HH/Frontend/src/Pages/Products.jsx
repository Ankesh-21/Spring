import axios from 'axios';
import React, { useEffect, useState } from 'react'
import Product from '../Components/Product';
const Products = () => {
    const [products,setProducts] = useState([]);
    useEffect(()=>{
        axios.get('https://localhost:8080/products')
        .then(res=>{
            setProducts(res.data)
        })
        .catch(err=>{
            console.log(err);
        });
    },[]);
  return (
    <div>
      {products.map((p,ind)=>(
        <Product key={ind} val={p}/>
      ))}
    </div>
  )
}

export default Products
