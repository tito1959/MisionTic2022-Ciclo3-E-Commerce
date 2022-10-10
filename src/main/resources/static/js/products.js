/*
 * Imprimir toda la lista de productos de la api
 */

document.addEventListener("DOMContentLoaded", () => {
  loadCategories();
  loadProducts();
});

const loadCategories = async () => {
  const $categories = document.getElementById("categories");
  const url = "http://localhost:8080/api/categories";

  const query = await fetch(url, {
    method: "GET",
    mode: "cors",
  });

  const response = await query.json();

  response.forEach((element) => {
    html = `
    <li>
        <a href="#" class="nav-link link-dark">
            ${element.name}
        </a>
    </li>`;

    $categories.insertAdjacentHTML("beforeend", html);
  });
};

const loadProducts = async () => {
  const $products = document.getElementById("products");
  const url = "http://localhost:8080/api/products";

  const query = await fetch(url, {
    method: "GET",
    mode: "cors",
  });

  const response = await query.json();

  response.forEach((element) => {
    html = `
        <div class="col-sm-6 col-md-5 mb-5">
        <div class="card h-100">
            <!-- Sale badge-->
            <div class="badge bg-dark text-white position-absolute"
                style="top: 0.5rem; right: 0.5rem">
                Sale
            </div>
            <!-- Product image-->
            <img class="card-img-top" src="https://picsum.photos/200/200"
                alt="..." />
            <!-- Product details-->
            <div class="card-body">
                <div class="text-center">
                    <!-- Product name-->
                    <h5 class="fw-bolder">${element.name}</h5>
                    <p>$${element.price}</p>
                </div>
            </div>
            <!-- Product actions-->
            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                <div class="text-center">
                    <a class="btn btn-outline-dark mt-auto" href="#">Buy</a>
                    <a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a>
                </div>
            </div>
        </div>
        </div>
    `;

    $products.insertAdjacentHTML("beforeend", html);
  });
};
