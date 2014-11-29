define('dataConfig', function() {
	var baseUri = 'http://localhost:9000/'
	return {
		provincesUri: baseUri + 'provinces/',
		constituencies: { 'key' : 'constituencies' },
		provinces: { 'key' : 'provinces' },
		candidates: { 'key' : 'candidates' }
	};
});