# Git
## Git commands

1. **git config**:
    * _Funktion_: Konfiguriert Git-Einstellungen auf globaler oder Repository-Ebene, wie Benutzername, E-Mail Alias-Befehle und andere Einstellungen.
    * _Parameter_: --global (für globale Einstellungen), --local (für lokale Einstellungen), user.name, user.email, etc.
    * _Betroffene Daten_: Meta-Informationen (Konfigurationseinstellungen)
    * _Veränderung_: Lokal (in den Konfigurationsdateien)

2. **git init**:
    * _Funktion_: Initialisiert ein neues, leeres Git-Repository oder reinitialisiert ein bestehendes.
    * _Parameter_: Keine oder Pfad zum gewünschten Verzeichnis.
    * _Betroffene Daten_: Meta-Informationen (erstellt einen .git-Ordner)
    * _Veränderung_: Lokal (im Arbeitsverzeichnis)

3. **git commit**:
    * _Funktion_: Erstellt einen neuen Commit mit den Änderungen, die in der Staging-Area vorgenommen wurden, und aktualisiert den aktuellen Branch.
    * _Parameter_: -m (für Commit-Nachricht)
    * _Betroffene Daten_: Nutzdaten/Dateien (speichert Änderungen in einem neuen Commit)
    * _Veränderung_: Lokal (im Repository)

4. **git status**:
    * _Funktion_: Zeigt den Status des Arbeitsverzeichnisses und des Staging-Bereichs an, einschließlich geänderter, hinzugefügter, gelöschter und nicht verfolgter Dateien.
    * _Parameter_: Keine oder optionale Parameter wie -s für Kurzstatus.
    * _Betroffene Daten_: Meta-Informationen (zeigt den Status von Dateien)
    * _Veränderung_: Keine

5. **git add**:
    * _Funktion_: Fügt Änderungen im Arbeitsverzeichnis zum Staging-Bereich hinzu.
    * _Parameter_: Dateiname oder Pfad, optionale Parameter wie -A zum Hinzufügen aller Dateien.
    * _Betroffene Daten_: Nutzdaten/Dateien (geänderte Dateien)
    * _Veränderung_: Lokal (im Repository, im Staging-Bereich)

6. **git log**:
    * _Funktion_: Zeigt die Commit-Historie des aktuellen Branches an.
    * _Parameter_: --oneline (für kurze Zusammenfassung), --graph (zeigt Branch-Struktur)
    * _Betroffene Daten_: Meta-Informationen (Commit-Historie)
    * _Veränderung_: Keine

7. **git diff**:
    * _Funktion_: Zeigt die Unterschiede zwischen dem Arbeitsverzeichnis, der Staging-Area und dem letzten Commit an.
    * _Parameter_: Optionale Parameter wie --staged zum Anzeigen der Unterschiede in der Staging-Area, usw.
    * _Betroffene Daten_: Nutzdaten/Dateien (zeigt Unterschiede in Dateien)
    * _Veränderung_: Keine

8. **git pull**:
    * _Funktion_: Holt Änderungen von einem Remote-Repository und integriert sie in den aktuellen lokalen Branch.
    * _Parameter_: Remote-Repository-Name (z.B. origin) und Branch-Name (z.B. master).
    * _Betroffene Daten_: Nutzdaten/Dateien (aktualisiert lokale Dateien)
    * _Veränderung_: Lokal (im Arbeitsverzeichnis und Repository)
    
9. **git push**:
    * _Funktion_: Überträgt lokale Commits auf ein Remote-Repository und aktualisiert den entsprechenden Remote-Branch.
    * _Parameter_: Remote-Repository-Name (z.B. origin) und Branch-Name (z.B. master), optionale Parameter wie --force zum Erzwingen des Pushs bei abweichenden Historien.
    * _Betroffene Daten_: Nutzdaten/Dateien (überträgt lokale Commits)
    * _Veränderung_: Auf dem Server (im entfernten Repository)

## Additional notes
### .gitignore
  
Nachdem man eine .gitignore-Datei hinzufügt und `git status` ausführt bemerkt man folgendes:
- Die .gitignore-Datei, die ich erstellt und dem Repository hinzugefügt habe, wird nicht mehr als "Untracked file" ausgeführt, da ich sie zum Staging-Bereich hinzugefügt und einen Commit erstellt habe.
- Alle *.html und *.pdf Dateien, die im Repository vorhanden sind, werden nicht mehr als "Untracked files" angezeigt. Das bedeutet, dass Git diese Dateien nicht mehr für die Versionsverwaltung berücksichtigt.