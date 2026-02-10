import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom';
import Product from './Product';
import { Link } from 'react-router-dom';
const ProductDetail = () => {
  const [product, setProduct] = useState({
    name: "",
    desc: "",
    price: 0,
    available: false,
    category: "",
  });
  const [image, setImage] = useState([]);
  const { id } = useParams();
  useEffect(() => {
    axios.get(`http://localhost:8080/api/product/${id}`)
      .then((response) => {
        setProduct(response.data);
        // console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  });
  return (
    <div className="min-h-screen bg-gray-50 p-6">
      <div className="max-w-6xl mx-auto flex flex-col md:flex-row gap-10">

        {/* LEFT: Image */}
        <div className="md:w-1/2 flex justify-center items-center">
          <img
            src={`http://localhost:8080/api/product/${id}/image`}
            alt="Product"
            className="w-full max-w-md rounded-xl shadow-lg object-cover"
          />
        </div>

        {/* RIGHT: Details */}
        <div className="md:w-1/2 flex flex-col gap-4">
          <h1 className="text-3xl font-bold">{product.name}</h1>

          <p className="text-xl text-green-600 font-semibold">
            {product.price}
          </p>

          <p className="text-gray-600">
            {product.desc}
          </p>

          <Link to={`/paymentgateway/${product.id}`}>
            <div className="flex gap-4 mt-4">
              <button disabled={!product.available} className={`px-6 py-2 bg-blue-600 text-white rounded-lg hover:bg-blue-700 ${!product.available ? "cursor-not-allowed" : "hover:bg-blue-700"}`}>
                {
                  product.available ? "Add to Cart" : "Out of Stock"
                }
              </button>
              <button disabled={!product.available} className={`px-6 py-2 border border-gray-400 rounded-lg ${product.available ?
                "bg-blue-600 hover:bg-green-700"
                : "bg-gray-400 cursor-not-allowed"
                }`} >
                Buy Now
              </button>

            </div>
          </Link>
        </div>

      </div>
    </div>
  )
}


export default ProductDetail