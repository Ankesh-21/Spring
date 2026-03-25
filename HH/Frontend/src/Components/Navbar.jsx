import React from "react";

const Navbar = () => {
  return (
    <nav className="bg-white w-full flex relative justify-between items-center mx-auto px-8 h-20">
      
      {/* LOGO */}
      <div className="inline-flex">
        <a href="/">
          <div className="hidden md:block">
            <svg width="102" height="32" fill="currentColor">
              <path d="M29.24 22.68c-.16-.39-.31-.8-.47-1.15l-.74-1.67..." />
            </svg>
          </div>

          <div className="block md:hidden">
            <svg width="30" height="32" fill="currentColor">
              <path d="M29.24 22.68c-.16-.39-.31-.8-.47-1.15l-.74-1.67..." />
            </svg>
          </div>
        </a>
      </div>

      {/* SEARCH BAR */}
      <div className="hidden sm:block flex-shrink flex-grow-0 px-2">
        <div className="inline-flex items-center">
          <button className="flex items-center w-60 border rounded-full px-3 py-1">
            <span className="flex-grow text-gray-500">
              Start your search
            </span>

            <div className="h-8 w-8 flex items-center justify-center">
              <svg
                viewBox="0 0 32 32"
                className="h-3 w-3 stroke-current"
                fill="none"
                strokeWidth="5"
              >
                <path d="m13 24c6.07 0 11-4.92 11-11S19.07 2 13 2 2 6.92 2 13s4.92 11 11 11zm8-3 9 9" />
              </svg>
            </div>
          </button>
        </div>
      </div>

      {/* RIGHT SIDE */}
      <div className="flex items-center">
        
        {/* HOST */}
        <a
          href="/addproduct"
          className="py-2 px-3 hover:bg-gray-200 rounded-full"
        >
          Add Products
        </a>

        {/* GLOBE */}
        <button className="py-2 px-3 hover:bg-gray-200 rounded-full">
          🌐
        </button>

        {/* PROFILE */}
        <button className="ml-3 flex items-center px-2 border rounded-full hover:shadow-lg">
          <span className="mr-2">☰</span>
          <span>👤</span>
        </button>

      </div>
    </nav>
  );
};

export default Navbar;