define('dataLoader', [
	'jquery',
	'dataConfig',
	'dataMocks'
], function($, config, mocks) { 
   var mocked = true,
	   strategy = function(loader, key, callback) {
			return mocked ? 
				callback(mocks.processMock(key)) :
				loader().done(function(data) { callback(data) });
	   };
   return {
	   getProvinces: function(callback) {
		   return strategy(function() {
			   return $.getJSON(config.provincesUri); 	   	
		   }, config.provinces, callback);
	   },
	   getConstituencies: function(provinceName, callback) {
		   return strategy(function(provinceName) {
			   $.getJSON(config.constituenciesUri + '/' + provinceName);	   	
		   }, $.extend(config.constituencies, { 
				'province': provinceName 
		   }), callback);
	   },
	   getCandidates: function(provinceName, constituencyName, callback) {
		   return strategy(function(provinceName, constituencyName) {
			   $.getJSON(config.candidatesUri + '/' + provinceName + '/' + constituencyName);
		   }, $.extend(config.candidates, { 
				'province': provinceName,
				'constituency': constituencyName
		   }), callback);
	   } 
   };
});