function filterSupermarkets() {
  // Obtener los valores de los campos del formulario
  const address = document.getElementById("address").value.toLowerCase();
  const postalCode = document.getElementById("postalCode").value;
  const city = document.getElementById("city").value.toLowerCase();

  // Obtener todos los elementos con la clase "card" (representando cada supermercado)
  const supermarkets = document.getElementsByClassName("card");

  let match = false;
  // Recorrer cada supermercado
  for (let i = 0; i < supermarkets.length; i++) {
    // Obtener los valores de la localización del supermercado
    const supermarketAddress = supermarkets[i].querySelector("#supermarket_address").innerText.toLowerCase();
    const supermarketPostalCode = supermarkets[i].querySelector("#supermarket_postalCode").value;
    const supermarketCity = supermarkets[i].querySelector("#supermarket_city").value.toLowerCase();

    // Verificar si algún atributo de la localización coincide con los valores del formulario
    if (address === "" && postalCode === "" && city === "") {
      match = true;
      supermarkets[i].style.display = "";
    } else if (
      (address !== "" && !supermarketAddress.includes(address)) ||
      (postalCode !== "" && postalCode != supermarketPostalCode) ||
      (city !== "" && city != supermarketCity)
    ) {
      supermarkets[i].style.display = "none";
    } else if (
      (address !== "" && supermarketAddress.includes(address)) ||
      (postalCode !== "" && postalCode === supermarketPostalCode) ||
      (city !== "" && city === supermarketCity)
    ) {
      match = true;
      supermarkets[i].style.display = "";
    }

  }

  const alert = document.getElementById("alert");
  if(!match) alert.style.display = "block";
  else alert.style.display = "none";
}