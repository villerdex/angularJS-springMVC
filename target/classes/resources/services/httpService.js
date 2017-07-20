'use strict';
(function(){

    angular
        .module('app')
        .factory('RestService', Service);

    Service.$inject = ['$http'];
    function Service($http){

        //var base_url = "http://localhost:8080";
        var base_url = window.location.origin
        var url = window.location.href;
        console.log(base_url)

        //custom
        var _base_headers = {
            "Content-Type" : "application/json"
        };

        var services = {
            post: post,
            get: get
        };

        return services;

        //////////

        function post(api, data, customHeader){

            var url = base_url + api;

            return $http({
                method: 'POST',
                url: url,
                headers: customHeader,
                data: data
            })
        }

        function get(api, customHeader){

            var url = base_url + api;

           return $http({
                method: 'GET',
                url: url,
                headers: customHeader
            });

        }

    }

})();