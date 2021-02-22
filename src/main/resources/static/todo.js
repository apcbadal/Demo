$(document).ready(function (e){
    let todoHTML ='<div  style="margin-bottom: 1%" class="todo_class">' +
        '        <input type="checkbox" id="status" style="vertical-align: middle">' +
        '        <input type="text" id="description" placeholder="To Do">' +
        '        <input type="button" class="add_new" value="Add New">' +
        '        <input type="button" class="remove_key" value="Remove">'+
        '</div>'

    $(document).on('click','.add_new',function (e){
        $(".todo_class").last().after(todoHTML);
    })
    $(document).on('click','.remove_key',function (e){
        $(this).parent().remove();
    })


    function getTodoLists(s, todoList) {
        let arr =$(s);
        $.each(arr,function (e){
            let status =false;
            if($(this).find('input:checked')[0]){
                 s = $(this).find('input:checked')[0].value;
                 status=true;
            }
            let description =$(this).find('input')[1].value;
            let toDoListDTOS={status,description}
            todoList.push(toDoListDTOS);
        })
    }

    $("#save").click(function (e){
        let title =$("#projectTitle").val();
        let todoList=[];
        getTodoLists(".todo_class",todoList);
        let projectObj ={};
        projectObj.title=title;
        projectObj.toDoLists=todoList;
        let projectJsonData=JSON.stringify(projectObj);

        $.ajax({
            type: 'post',
            enctype: 'multipart/form-data',
            contentType: 'application/json',
            url: "/saveTodo",
            data: projectJsonData,
            processData: false, //prevent jQuery from automatically transforming the data into a query string
            cache: false,
            timeout: 600000,
            dataType: 'json',
            success: function (data, textStatus, xhr) {
                    alert("Data Saved Successfully.")
            },

            error: function (e) {

            }

        })

    })
})