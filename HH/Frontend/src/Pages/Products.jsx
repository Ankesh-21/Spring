import axios from 'axios';
import React, { useEffect, useState } from 'react'
import Product from '../Components/Product';
const Products = () => {
    const [products,setProducts] = useState([]);
    useEffect(()=>{
        axios.get('http://localhost:8080/products')
        .then(res=>{
          console.log(`from then ${res.data}`);
          setProducts(res.data)
        })
        .catch(err=>{
            console.log(err);
        });
    },[]);
  return (
    <div className='grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-6'>
      {products.map((p,ind)=>(
        <Product key={ind} val={p}/>
      ))}
    </div>
  )
}

export default Products
