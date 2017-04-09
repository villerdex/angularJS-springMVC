'use strict';
(function () {
    angular
        .module('app')
        .component('home', {
            templateUrl: '/components/home/home.html',
            controller: Controller
        });

    Controller.$inject = [];
    function Controller() {
    }
})();