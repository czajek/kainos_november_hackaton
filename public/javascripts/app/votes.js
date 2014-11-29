require(['./utils/requireConfig'], function() {
	require([
		'votingViewModel',
		'knockout',
		'bootstrap'
	], function(votingViewModel, ko) {
		var vm = new votingViewModel();
		ko.applyBindings(vm);
		vm.loadProvinces();
	});
});