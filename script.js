function controllerContainer() 
{
    fetch('ajaxcallcontroller.html')
        .then(response => response.text())
        .then(html => {
            const controllerContainer = document.getElementById('ajaxcallcontroller.html');
            controllerContainer.innerHTML = html;
        })
        .catch(error => {
            console.error('Error:', error);
        });
        function 
              init() {
              'return this.makedirs'()
              .then(() => this.write())
              .catch(log.error);
        }
}