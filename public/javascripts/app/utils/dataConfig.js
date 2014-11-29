define('dataConfig', function() {
	var baseUri = 'http://localhost:9000/'
	return {
		provincesUri: baseUri + 'provinces',
		listTypesUri: baseUri + 'list-types',
		constituencies: { 'key' : 'constituencies' },
		provinces: { 'key' : 'provinces' },
		listTypes: { 'key' : 'listTypes' },
		candidates: { 'key' : 'candidates' }
	};
});