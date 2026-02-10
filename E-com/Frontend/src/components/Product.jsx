import React from "react";
import { Link } from "react-router-dom";

const Product = (props) => {
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
                    <h5 className="mt-3 mb-6 text-2xl font-semibold tracking-tight text-heading">{props.name}</h5>
                </a>
                <a href={`/product/${props.id}`} className="inline-flex items-center text-black bg-brand box-border border border-transparent hover:bg-brand-strong focus:ring-4 focus:ring-brand-medium shadow-xs font-medium leading-5 rounded-base text-sm px-4 py-2.5 focus:outline-none bg-sky-500">
                    {
                        props.available ? "Add to Cart" : "Out of Stock"
                    }
                    <svg className="w-4 h-4 ms-1.5 rtl:rotate-180 -me-0.5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24"><path stroke="currentColor" strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M19 12H5m14 0-4 4m4-4-4-4" /></svg>
                </a>
            </div>
        </div>


    );
};

export default Product;
