# Общение сервер - клиент (пример TCP)

##### В данном проекте осуществлена реализация сервера, способного принимать подключения, а также клиента, который будет подключаться к подобному серверу.
##### Структура проекта: 
 - *Создан сервер с использованием ServerSocket (класс Server);*
 - *Создан клиент с использованием Socket (класс Client);*
 - *При входящем соединении на сервер, принимается от клиента запрос, который преобразован в строку и выведен на экран вместе с номером порта, с которого это соединение пришло;*
 - *В другом классе Client идет подключение к этому серверу и отправлена ему одна строка с сообщением.*