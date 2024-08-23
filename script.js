function controllerContainer() 
{
    fetch('Frontend AJAX Call.html')
        .then(response => response.text())
        .then(html => {
            const controllerContainer = document.getElementById('Frontend AJAX Call.html');
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