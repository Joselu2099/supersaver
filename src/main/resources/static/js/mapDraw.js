
function initMap() {
  var location = document.getElementById("location").value;
  var map = new google.maps.Map(document.getElementById("map"), {
    zoom: 15,
    center: {lat: 0, lng: 0}
  });

  var geocoder = new google.maps.Geocoder();
  geocoder.geocode({address: location}, function(results, status) {
    if (status === "OK") {
      map.setCenter(results[0].geometry.location);
      var marker = new google.maps.Marker({
        map: map,
        position: results[0].geometry.location
      });
    } else {
      console.log("Geocode was not successful for the following reason: " + status);
    }
  });
}