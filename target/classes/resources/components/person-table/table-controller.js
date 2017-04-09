'use strict';
(function () {
    angular
        .module('app')
        .component('personTable', {
            templateUrl: '/components/person-table/table.html',
            controller: Controller
        });

    Controller.$inject = ['RestService'];
    function Controller(RestService) {
        var controller = this;


        controller.isShowForm = false;
        controller.getPersons = getPersons;
        controller.showForm = showForm;
        controller.onEdit = onEdit;
        controller.onDelete = onDelete;
        controller.Persons = [];

        // will communicate with person form component
        controller.callback = {
            getPersons: controller.getPersons
        };

        // person form optional data
        controller.data = {
            show:  controller.isShowForm,   //required
            person: ""                      // optional
        };

        // table ordering and sorting
        controller.query = {
            order: 'id',
            limit: 10,
            page: 1,
        };


        active();

        function active() {
            getPersons();
        }
        
        function getPersons() {
            var response = RestService.get('/person/getPerson',{});

            response.then(function (response) {
                controller.Persons = response.data;     // add data to front end
            }), function (result) {
                console.log(result)
            };

        }
        
        function showForm() {
            controller.data.show = true;
            controller.data.person = "";
        }
        
        function onEdit(person) {
            controller.data.person = person;
            controller.data.show = true;
        }

        function onDelete(id, $event) {
            $event.stopPropagation();
            console.log(id);
            var response = RestService.post('/person/deletePerson', id, {});
            response.then(function (response) {
                getPersons() ;               // repopulate table
            }), function (result) {
                console.log(result)
            };


        }
    }
})();