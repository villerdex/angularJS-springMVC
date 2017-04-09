'use strict';
(function() {

    angular
        .module('app')
        .config(Config);

    Config.$inject = ['$locationProvider', '$routeProvider'];
    function Config($locationProvider, $routeProvider) {
        $locationProvider.hashPrefix('!');

        console.log("route activated");
        $routeProvider
            .when('/', {
                templateUrl: '/views/home.html'
            })
            .when('/login', {
                templateUrl: '/views/login.html'
            })
            .when('/404', {
                templateUrl: '/views/404/404.html'
            })
            .when('/person-table', {
                 templateUrl: '/views/person-list.html'
            })
            .otherwise('/404'); 
    }

})();