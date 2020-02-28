 $(".alert").delay(4000).slideUp(200, function() {
    $(this).alert('close');
});

$(function () {
	  $('[data-toggle="tooltip"]').tooltip()
	})

$('#ModalExclusao').on('shown.bs.modal', function () {
  $('#myInput').trigger('focus')
})

$('#ModalExclusao').on('shown.bs.modal', function (event) {	
	var button = $(event.relatedTarget);
	var idEvento = button.data('id');
	var modal = $(this);
	var form = modal.find('form');
	var action = form.attr('action');
	if (!action.endWith('/')) {
		action += '/';
	}
	form.attr('action', action + idEvento);
})

//$(function() {
//	$('.js-currency').maskMoney({decimal: ',', thousands: '.', allowZero: true});
//	
//	$('.js-atualizar-status').on('click', function(event) {
//		event.preventDefault();
//		
//		var botaoReceber = $(event.currentTarget);
//		var urlReceber = botaoReceber.attr('href');
//		
//		var response = $.ajax ({
//			url: urlReceber,
//			type: 'PUT'
//		});
//		
//		response.done(function(e) {
//			var codigoTitulo = botaoReceber.data('codigo');
//			$('[data-role=' + codigoTitulo + ']').html('<span class="label-green">' + e + '</span>');
//			botaoReceber.hide();
//		});
//		
//		response.fail(function(e) {
//			console.log(e);
//			alert('Erro');
//		});
//	})
//})