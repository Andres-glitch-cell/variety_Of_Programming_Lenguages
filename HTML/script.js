function copyCode(button) {
    const codeBlock = button.parentElement.nextElementSibling.querySelector('code');
    const text = codeBlock.innerText;
    
    navigator.clipboard.writeText(text).then(() => {
        const originalText = button.innerText;
        button.innerText = '✅ Copiado!';
        
        setTimeout(() => {
            button.innerText = originalText;
        }, 2000);
    }).catch(err => {
        console.error('Error al copiar:', err);
        button.innerText = '❌ Error!';
    });
}