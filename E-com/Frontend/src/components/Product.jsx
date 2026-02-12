import React from "react";
import { Link } from "react-router-dom";

const Product = (props) => {
    const handleDelete = (e) => {
        e.preventDefault();
        if (props.onDelete) props.onDelete(props.id);
    }

    return (
        <div className="bg-neutral-primary-soft block max-w-sm border border-default rounded-base shadow-xs">
            <a href={`/product/${props.id}`}>
                <img className="rounded-t-base" src="/docs/images/blog/image-1.jpg" alt="" />
            </a>
            <div className="p-6 text-center">
                <span className="inline-flex items-center bg-brand-softer border border-brand-subtle text-fg-brand-strong text-xs font-medium px-1.5 py-0.5 rounded-sm">
                    {props.category}
                </span>
                <a href={`/product/${props.id}`}>
                    <h5 className="mt-3 mb-4 text-2xl font-semibold tracking-tight text-heading">{props.name}</h5>
                </a>

                <div className="flex items-center justify-center gap-2">
                    <Link to={`/product/${props.id}`} className="inline-flex items-center text-black bg-sky-500 font-medium leading-5 rounded-base text-sm px-4 py-2.5">
                        {props.available ? "View" : "View"}
                    </Link>

                    <Link to={`/product/edit/${props.id}`} className="inline-flex items-center text-white bg-yellow-500 font-medium leading-5 rounded-base text-sm px-3 py-2.5">
                        Edit
                    </Link>

                    <button onClick={handleDelete} className="inline-flex items-center text-white bg-red-600 font-medium leading-5 rounded-base text-sm px-3 py-2.5">
                        Delete
                    </button>
                </div>
            </div>
        </div>
    );
};

export default Product;
