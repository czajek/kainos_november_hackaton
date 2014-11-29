define('dataMocks', ['dataConfig'], function(config) {
	var constituencies = config.constituencies.key,
		provinces = config.provinces.key,
	    candidates = config.candidates.key,
		data = {
			constituencies: {
				process: function(item) {
					return [
					];
				}
			},
			provinces: {
				process: function(item) {
					return [
						{ 'name': 'Pomorskie' },
						{ 'name': 'Wielkopolskie' }
					];
				}
			},
			candidates: {
				process: function(item) {
					return [
					];
				}
			}
		};
	return {
		processMock: function (item) {
			return data[item.key].process(item);
		}
	};
});