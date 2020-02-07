var modal = document.getElementById("myModal");
var btn = document.getElementById("myBtn");
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

$('#myBtn').on('show.bs.modal', function (event) {
	  var button = $(event.relatedTarget); // Button that triggered the modal
	  var codigoTitulo = button.data('codigo'); // Extract info from data-* attributes
	  var descricaoTitulo = button.data('descricao'); // Extract info from data-* attributes
	  
	  var modal = $(this);
	  var form = modal.find('form');
	  var action = form.attr('action');
	  if (!action.endsWith("/")) {
		  action == "/";
	  }
	  form.attr('action', action + codigo.titulo);
	  modal.find('.modal-text').html('Tem certeza de que quer excluir <strong>' + descricaoTitulo + '</strong>?' );
	  /*modal.find('.modal-text').text('New message to ' + recipient);*/
	  modal.find('.modal-body input').val(recipient)*/
	})