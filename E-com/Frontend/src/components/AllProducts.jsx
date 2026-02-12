import React from "react";
import Product from "./Product";

const AllProducts = ({ products, onDelete }) => {
  return (
    <div className="grid grid-cols-4 gap-4">
      {products.map((product) => (
        <Product key={product.id} {...product} onDelete={onDelete} />
      ))}
    </div>
  );
};

export default AllProducts;
