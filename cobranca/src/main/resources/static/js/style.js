var modal = document.getElementById("myModal");
var btn = document.getElementById("modalBtn");
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

$('#remove').on('.modal-btn-yes', function (event) {
	  var button = $(event.relatedTarget); // Button that triggered the modal
	  var codigoTitulo = button.data('codigo'); // Extract info from data-* attributes
	  var descricaoTitulo = button.data('descricao'); // Extract info from data-* attributes
	  
	  var modal = $(this);
	  var form = modal.find('form');
	  var action = form.attr('action');
	  if (!action.endsWith("/")) {
		  action == "/";
	  }
	  form.attr('action', action + codigoTitulo);
	  modal.find('.modal-title span').html('Tem certeza de que quer excluir <strong>' + descricaoTitulo + '</strong>?' );
	  modal.find('.modal-text').text('New message to ' + recipient);
	  modal.find('.modal-body input').val(recipient)
	})