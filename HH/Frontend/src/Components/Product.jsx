import React, { useState } from 'react'

const Product = ({props}) => {
    // const [produt,setProduct] = useState({
    //     brand:'',
    //     name:'',
    //     category:'',
    //     size:'',
    //     shape:'',
    //     price:0
    // });
    // const updateProductDetails = (newProduct)=>{
    //     setProduct((prevProduct)=>({
    //         ...prevProduct,
    //         brand: newProduct.brand,
    //         name: newProduct.name,
    //         category:newProduct.category,
    //         size:newProduct.size,
    //         shape:newProduct.shape,
    //         price:newProduct.price
    //     }));
    // };
  return (
    <div>
      Recieved:{props}
    </div>
  )
}

export default Product
