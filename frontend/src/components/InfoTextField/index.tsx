import { InputAdornment, TextField } from '@mui/material'
import React from 'react'

interface InfoTextFieldProps {
  label: string
  icon: JSX.Element
  fullWidth?: boolean
  disabled?: boolean
  defaultValue?: string
  value?: string
  onChange?: (e: React.ChangeEvent<HTMLInputElement>) => void
}

export function InfoTextField({
  label,
  icon,
  fullWidth,
  disabled,
  defaultValue,
  value,
  onChange
}: InfoTextFieldProps) {
  return (
    <TextField
      margin="normal"
      required
      fullWidth={fullWidth}
      label={label}
      disabled={disabled}
      defaultValue={defaultValue}
      value={value}
      onChange={onChange}
      InputProps={{
        startAdornment: <InputAdornment position="start">{icon}</InputAdornment>
      }}
    />
  )
}