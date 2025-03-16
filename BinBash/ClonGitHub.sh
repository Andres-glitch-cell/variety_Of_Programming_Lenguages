#!/bin/bash

while true; do
    echo -e "\n=== Menu ==="
    echo "1. Ver fecha actual"
    echo "2. Ver directorio actual"
    echo "3. Listar archivos"
    echo "4. Ver espacio en disco"
    echo "5. Salir"
    
    read -p "Elige una opción (1-5): " opcion
    
    case $opcion in
        1)
            echo "Fecha actual:"
            date
            ;;
        2)
            echo "Directorio actual:"
            pwd
            ;;
        3)
            echo "Lista de archivos:"
            ls -l
            ;;
        4)
            echo "Espacio en disco:"
            df -h
            ;;
        5)
            echo "¡Hasta luego!"
            exit 0
            ;;
        *)
            echo "Opción no válida"
            ;;
    esac
    
done