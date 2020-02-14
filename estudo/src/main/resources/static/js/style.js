/*$('#modalBtn').on('show.bs.modal', function (event) {
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
	  /*modal.find('.modal-text').text('New message to ' + recipient);
	  modal.find('.modal-body input').val(recipient)
	})
	
$(function() {
	$('.js-currency').maskMoney({decimal: ',', thousands: '.', allowZero: true});
	
	$('.js-atualizar-status').on('click', function(event) {
		event.preventDefault();
		
		var botaoReceber = $(event.currentTarget);
		var urlReceber = botaoReceber.attr('href');
		
		var response = $.ajax ({
			url: urlReceber,
			type: 'PUT'
		});
		
		response.done(function(e) {
			var codigoTitulo = botaoReceber.data('codigo');
			$('[data-role=' + codigoTitulo + ']').html('<span class="label-green">' + e + '</span>');
			botaoReceber.hide();
		});
		
		response.fail(function(e) {
			console.log(e);
			alert('Erro');
		});
	})
})*/