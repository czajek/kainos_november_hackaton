define(function() {
	require.config({
		shim : {
			'bootstrap' : { 'deps' :['jquery'] }
		},
		paths: {
			'jquery' : '../lib/jquery/jquery.min',
			'bootstrap' :  '../lib/bootstrap/bootstrap.min',
			'knockout': '../lib/knockout/knockout-3.2.0',
			'resultsViewModel': './viewModel/resultsViewModel',
			'votingViewModel': './viewModel/votingViewModel',
			'dataLoader': './utils/dataLoader',
			'dataConfig': './utils/dataConfig',
			'dataMocks': './utils/dataMocks',
			'dataLoader': './utils/dataLoader'
		}
	});
})
