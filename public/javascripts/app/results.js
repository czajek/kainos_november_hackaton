require(['./utils/requireConfig'], function() {
	require([
		'resultsViewModel',
		'knockout'
	], function(resultsViewModel, ko) {
		var vm = new resultsViewModel();
		ko.applyBindings(vm);
		console.log('results page');
	});
});
