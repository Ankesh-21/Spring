import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';
import Product from './Product';
const ProductDetail = () => {
    const [product,setProduct] = useState({
      name:"",
      desc:"",
      price:0,
      available:false,
      category:""
    });
    const {id} = useParams();
    useEffect(()=>{
        axios.get(`http://localhost:8080/api/product/${id}`)
        .then((response)=>{
            setProduct(response.data);
            // console.log(response.data);
        })
        .catch((err)=>{
            console.log(err);
        });
    });
  return (
    <div>
      <Product key = {product.id} {...product}/>
    </div>
  )
}

export default ProductDetail