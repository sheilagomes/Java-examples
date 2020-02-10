var modal = document.getElementById("myModal");
var btn = document.getElementById("modalRemove");
var span = document.getElementsByClassName("close")[0];
btn.onclick = function() {
  modal.style.display = "block";
}
span.onclick = function() {
  modal.style.display = "none";
}
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}

var searchElement = document.createElement("span");
document.querySelector(".remove").appendChild(searchElement);
searchElement.addEventListener("click", (e) => {
	  alert("aaaaah");
	  var button = event.relatedTarget; // Button that triggered the modal
	  var codigoTitulo = button.data('codigo'); // Extract info from data-* attributes
	  var descricaoTitulo = button.data('descricao'); // Extract info from data-* attributes
	  
	  var form = document.querySelector('form');
	  var action = form.data('url-base');
	  if (!action.endsWith("/")) {
		  action == "/";
	  }
	  form.attr('action', action + codigoTitulo);
	  // document.querySelector("a").getAttribute("action");
})