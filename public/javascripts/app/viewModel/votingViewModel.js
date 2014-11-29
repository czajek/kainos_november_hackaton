define('votingViewModel', [
	'dataLoader',
	'knockout'
], function(loader, ko) { 
	var VotingViewModel = function() {
		var vm = this;
		vm.provincesBeingLoaded = ko.observable(true);
		vm.listTypesBeingLoaded = ko.observable(true);

		vm.province = ko.observable();
		vm.province.subscribe(function(newValue) {
			console.log(newValue);
		});
		
		vm.listType = ko.observable();
		vm.listType.subscribe(function(newValue) {
			console.log(newValue);
		});
		
		vm.provinces = ko.observableArray();
		this.loadProvinces = function() {
			vm.provincesBeingLoaded(true);
			loader.getProvinces(function(data) {
				vm.provinces(data);
				vm.provincesBeingLoaded(false);
			});
		};
		
		vm.listTypes = ko.observableArray();
		this.loadListTypes = function() {
			vm.listTypesBeingLoaded(true);
			loader.getListTypes(function(data) {
				vm.listTypes(data);
				vm.listTypesBeingLoaded(false);
			});
		};
	};

	return VotingViewModel;
});