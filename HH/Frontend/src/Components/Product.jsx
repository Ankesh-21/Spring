import React, { useState } from 'react'

const Product = (props) => {
  return (
    <div className="group relative flex flex-col bg-white border border-slate-200 rounded-2xl w-80 p-5 shadow-md hover:shadow-xl transition-all duration-300 hover:-translate-y-1">

      {/* Product Name */}
      <h2 className="text-lg font-bold text-slate-800 mb-1">
        {props.val.product_name}
      </h2>

      {/* Category Badge */}
      <span className="inline-block w-fit px-3 py-1 text-xs font-medium bg-blue-100 text-blue-600 rounded-full mb-3">
        {props.val.category}
      </span>

      {/* Divider */}
      <div className="border-t border-slate-100 my-2"></div>

      {/* Product Details */}
      <div className="space-y-1 text-sm text-slate-600">
        <p>
          <span className="font-medium text-slate-700">Size (inch):</span> {props.val.size_inch}
        </p>
        <p>
          <span className="font-medium text-slate-700">Size (mm):</span> {props.val.nominal_size_mm}
        </p>
      </div>

      {/* Price */}
      <div className="mt-4 flex items-center justify-between">
        <p className="text-xl font-semibold text-green-600">
          ₹{props.val.mrp}
        </p>
      </div>

      {/* Button */}
      <button
        className="mt-4 w-full rounded-lg bg-slate-800 py-2 text-sm font-medium text-white transition-all hover:bg-slate-700 hover:shadow-md active:scale-95"
        type="button"
      >
        View Details
      </button>

    </div>

    // <div>
    //   {/* {console.log(props.val)} */}
    //   Recieved:{JSON.stringify(props.val)}
    // </div>
  )
}

export default Product
