import React from 'react'
import { useState } from "react";
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
const AddProduct = () => {
    const [success, setSuccess] = useState(false);
    const navigate = useNavigate();
    const [product, setProduct] = useState({
        name: "",
        desc: "",
        brand: "",
        price: "",
        category: "",
        releaseDate: "",
        available: false,
        stockQuantity: "",
        image: null,
    });

    const handleChange = (e) => {
        const { name, value, type, checked, files } = e.target;

        if (type === "checkbox") {
            setProduct({ ...product, [name]: checked });
        } else if (type === "file") {
            setProduct({ ...product, image: files[0] });
        } else {
            setProduct({ ...product, [name]: value });
        }
    };

    const handleSubmit = (e) => {
        e.preventDefault();

        // FormData is required for image upload
        const formData = new FormData();
        
        formData.append(
            "product",
            new Blob([JSON.stringify(product)], { type: "application/json" })
        );
        formData.append("imageFile", product.image);
        setSuccess(true);
        console.log("Submitting product:", product);
        setTimeout(() => {
            setSuccess(false);
        }, 3000);
        // later you can do:
        axios.post("http://localhost:8080/api/product", formData)
        navigate("/");
    };

    return (
        <div className="min-h-screen bg-gray-100 flex items-center justify-center p-6">
            <form
                onSubmit={handleSubmit}
                className="bg-white shadow-lg rounded-xl p-8 w-full max-w-2xl space-y-6"
            >
                {success && (
                    <div className="rounded-lg bg-green-100 border border-green-400 text-green-800 px-4 py-3">
                        ✅ Product added successfully!
                    </div>
                )}
                <h2 className="text-2xl font-semibold text-gray-800">
                    Add New Product
                </h2>

                {/* Name */}
                <div>
                    <label className="block text-sm font-medium text-gray-700">
                        Product Name
                    </label>
                    <input
                        type="text"
                        name="name"
                        value={product.name}
                        onChange={handleChange}
                        className="mt-1 w-full rounded-lg border border-gray-300 px-3 py-2 focus:ring-2 focus:ring-blue-500"
                        required
                    />
                </div>

                {/* Description */}
                <div>
                    <label className="block text-sm font-medium text-gray-700">
                        Description
                    </label>
                    <textarea
                        name="desc"
                        value={product.desc}
                        onChange={handleChange}
                        rows="3"
                        className="mt-1 w-full rounded-lg border border-gray-300 px-3 py-2 focus:ring-2 focus:ring-blue-500"
                    />
                </div>

                {/* Brand & Category */}
                <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                    <div>
                        <label className="block text-sm font-medium text-gray-700">
                            Brand
                        </label>
                        <input
                            type="text"
                            name="brand"
                            value={product.brand}
                            onChange={handleChange}
                            className="mt-1 w-full rounded-lg border border-gray-300 px-3 py-2"
                        />
                    </div>

                    <div>
                        <label className="block text-sm font-medium text-gray-700">
                            Category
                        </label>
                        <input
                            type="text"
                            name="category"
                            value={product.category}
                            onChange={handleChange}
                            className="mt-1 w-full rounded-lg border border-gray-300 px-3 py-2"
                        />
                    </div>
                </div>

                {/* Price & Stock */}
                <div className="grid grid-cols-1 md:grid-cols-2 gap-4">
                    <div>
                        <label className="block text-sm font-medium text-gray-700">
                            Price
                        </label>
                        <input
                            type="number"
                            step="0.01"
                            name="price"
                            value={product.price}
                            onChange={handleChange}
                            className="mt-1 w-full rounded-lg border border-gray-300 px-3 py-2"
                        />
                    </div>

                    <div>
                        <label className="block text-sm font-medium text-gray-700">
                            Stock Quantity
                        </label>
                        <input
                            type="number"
                            name="stockQuantity"
                            value={product.stockQuantity}
                            onChange={handleChange}
                            className="mt-1 w-full rounded-lg border border-gray-300 px-3 py-2"
                        />
                    </div>
                </div>

                {/* Release Date */}
                <div>
                    <label className="block text-sm font-medium text-gray-700">
                        Release Date
                    </label>
                    <input
                        type="date"
                        name="releaseDate"
                        value={product.releaseDate}
                        onChange={handleChange}
                        className="mt-1 w-full rounded-lg border border-gray-300 px-3 py-2"
                    />
                </div>

                {/* Available */}
                <div className="flex items-center gap-2">
                    <input
                        type="checkbox"
                        name="available"
                        checked={product.available}
                        onChange={handleChange}
                        className="h-4 w-4 text-blue-600"
                    />
                    <label className="text-sm text-gray-700">
                        Available in stock
                    </label>
                </div>

                {/* Image Upload */}
                <div>
                    <label className="block text-sm font-medium text-gray-700">
                        Product Image
                    </label>
                    <input
                        type="file"
                        name="image"
                        accept="image/*"
                        onChange={handleChange}
                        className="mt-1 w-full text-sm"
                    />
                </div>

                {/* Submit */}
                <button
                    type="submit"
                    className="w-full bg-blue-600 text-white py-2 rounded-lg font-medium hover:bg-blue-700 transition"
                >
                    Save Product
                </button>
            </form>
        </div>
    );
}

export default AddProduct