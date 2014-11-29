define('dataLoader', [
	'jquery',
	'dataConfig',
	'dataMocks'
], function($, config, mocks) { 
   var strategy = function(loader, key, callback, mocked) {
   	    mocked = mocked || false;
		return mocked ? 
			callback(mocks.processMock(key)) :
			loader().done(function(data) { callback(data) });
   };
   return {
	   getProvinces: function(callback) {
		   return strategy(function() {
			   return $.getJSON(config.provincesUri); 	   	
		   }, config.provinces, callback, true);
	   },
	   getListTypes: function(callback) {
		   return strategy(function() {
			   return $.getJSON(config.listTypesUri)
		   }, config.listTypes, callback);
	   },
	   getConstituencies: function(provinceName, callback) {
		   return strategy(function(provinceName) {
			   $.getJSON(config.provincesUri + '/' + provinceName);	   	
		   }, $.extend(config.constituencies, { 
				'province': provinceName 
		   }), callback, true);
	   },
	   getCandidates: function(provinceName, constituencyName, callback) {
		   return strategy(function(provinceName, constituencyName) {
			   $.getJSON(config.provincesUri + '/' + provinceName + '/' + constituencyName);
		   }, $.extend(config.candidates, { 
				'province': provinceName,
				'constituency': constituencyName
		   }), callback, true);
	   } 
   };
});
