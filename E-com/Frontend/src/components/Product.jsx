import React from "react";

const Product = (props) => {
  return (
//     <div
//       className="max-w-sm rounded overflow-hidden 
// shadow-lg transform hover:scale-105 
// transition-transform duration-300 mx-auto p-4"
//     >
//       <div className="font-bold text-xl mb-2">{props.name}</div>
//       <h3 className="text-gray-700 text-base">
//         <span>#{props.category}</span>
//         <span>#{props.brand}</span>
//         {props.available ? <div>Add to Cart</div> : <div>Out of Stock</div>}
//       </h3>
//     </div>


<div class="bg-neutral-primary-soft block max-w-sm border border-default rounded-base shadow-xs">
    <a href="#">
        <img class="rounded-t-base" src="/docs/images/blog/image-1.jpg" alt="" />
    </a>
    <div class="p-6 text-center">
        <span class="inline-flex items-center bg-brand-softer border border-brand-subtle text-fg-brand-strong text-xs font-medium px-1.5 py-0.5 rounded-sm">
            {props.category}
        </span>
        <a href="#">
            <h5 class="mt-3 mb-6 text-2xl font-semibold tracking-tight text-heading">{props.name}</h5>
        </a>
        <a href="#" class="inline-flex items-center text-white bg-brand box-border border border-transparent hover:bg-brand-strong focus:ring-4 focus:ring-brand-medium shadow-xs font-medium leading-5 rounded-base text-sm px-4 py-2.5 focus:outline-none">
            {
                props.available ? "Add to Cart" : "Out of Stock"
            }
            <svg class="w-4 h-4 ms-1.5 rtl:rotate-180 -me-0.5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" viewBox="0 0 24 24"><path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 12H5m14 0-4 4m4-4-4-4"/></svg>
        </a>
    </div>
</div>

  );
};

export default Product;
